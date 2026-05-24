package model;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tbl_tecnico")
@Getter
@Setter
public class Tecnico {
	
	@Id
	@Column(name = "id_tecnico")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTecnico;
	
	
	@Column(name = "nombre")
	private String nombre;
	
	
	@Column(name = "especialidad")
	private String especialidad;
	
	public String getEspecialidadDescripcion() {
		switch (especialidad) {
		case "S": return "Software";
		case "H": return "Hardware";
		case "R": return "Redes";
		case "B": return "Base de datos";
		default : return "Desconocido";
		}
	}
}
