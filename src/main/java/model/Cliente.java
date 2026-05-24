package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name ="tbl_cliente")
@Getter
@Setter
public class Cliente {

	@Id
	@Column(name = "id_cliente")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	
	
	@Column(name = "razon_social")
	private String razonSocial;
	
	
	@Column(name = "ruc")
	private String ruc;

	@Override
	public String toString() {
		return razonSocial;
	}
}
