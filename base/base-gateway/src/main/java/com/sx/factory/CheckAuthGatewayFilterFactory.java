package com.sx.factory;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.server.reactive.ServerHttpRequest;

import java.util.Arrays;
import java.util.List;

/**
 * 设置认证验证标记
 *
 * @author 巴明端
 * data: 2019-09-09 12:12:12
 */
public class CheckAuthGatewayFilterFactory extends AbstractGatewayFilterFactory<CheckAuthGatewayFilterFactory.Config> {

	private static final String KEY = "CheckAuth";

	@Override
	public List<String> shortcutFieldOrder() {
		return Arrays.asList(KEY);
	}

	public CheckAuthGatewayFilterFactory() {
		super(Config.class);
	}

	@Override
	public GatewayFilter apply(Config config) {
		return (exchange, chain) -> {
			ServerHttpRequest request = exchange.getRequest().mutate()
					.header(KEY, config.getCheckAuth())
					.build();

			return chain.filter(exchange.mutate().request(request).build());
		};
	}

	public static class Config {
		private Boolean checkAuth = false;

		public Boolean isCheckAuth() {
			return checkAuth;
		}

		public void setCheckAuth(Boolean checkAuth) {
			this.checkAuth = checkAuth;
		}

		public String getCheckAuth() {
			return this.checkAuth.toString();
		}
	}
}
