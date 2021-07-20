package com.sx.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author huanghao 
 * @Date 2021-07-16 16:50:51 
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
@DynamicUpdate
@Entity
@Table ( name ="t_goods" )
public class TGoods implements Serializable {

	private static final long serialVersionUID =  1362217530607958597L;

   	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

   	@Column(name = "name" )
	private String name;

   	@Column(name = "price" )
	private BigDecimal price;
}
