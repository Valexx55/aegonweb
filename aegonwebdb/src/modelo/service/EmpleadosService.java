package modelo.service;

import java.util.List;

import modelo.dto.EmpleadoDTO;
import modelo.persistencia.EmpleadoDAO;

public class EmpleadosService {
	
	private EmpleadoDAO edao;
	
	public List<EmpleadoDTO> obtenerEmpleados ()
	{
		List<EmpleadoDTO> lista_empleados = null;
		
			edao = new EmpleadoDAO();
			lista_empleados = edao.getEmpleados();
		
		return lista_empleados;
		
	}

}
