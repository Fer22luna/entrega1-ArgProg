
package entrega1.entidades;

import java.util.List;


public class Alumno {

    private String nombre;
    private Integer matricula;
    private List<Materia> materiasAprobadas;
  

    public Alumno() {
    }

    public Alumno(String nombre, Integer matricula, List<Materia> materiasAprobadas) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.materiasAprobadas = materiasAprobadas;
    }

    
    public String getNombre() {
        return nombre;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }


}
