package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.Fetch;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name ="tbl_orden_soporte")
@Getter
@Setter
@DynamicInsert
public class OrdenSoporte {

	@Id
	@Column(name = "nro_orden")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer nroOrden;
	
	
	@Column(name = "fecha_registro")
	private LocalDate fechaRegistro;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tecnico")
	private Tecnico idTecnico;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cliente")
	private Cliente idCliente;
	
	@Column(name ="monto")
	private Double monto;
	
	@Column(name ="detalle_incidencia")
	private String detalleIncidencia;


}
