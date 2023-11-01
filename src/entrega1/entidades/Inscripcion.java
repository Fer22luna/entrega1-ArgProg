
package entrega1.entidades;

import java.util.List;


public class Inscripcion {
    
    private Alumno alumno;
    private Materia materiaAInscribirse;
    private boolean aprobada;

    public Inscripcion() {
    }

    public Inscripcion(Alumno alumno, Materia materiaAInscribirse) {
        this.alumno = alumno;
        this.materiaAInscribirse = materiaAInscribirse;
        this.aprobada = false;
    }

    
    public void validarInscripcion(){
        
        List<Materia> materiasAlumno = alumno.getMateriasAprobadas();
        List<Materia> materiasCorrelativas = this.materiaAInscribirse.getCorrelativas();
        
        if(materiasAlumno.contains(this.materiaAInscribirse)){
            System.out.println("El alumno ya tiene aprobada la materia a inscribirse");  
        }else if(materiasAlumno.containsAll(materiasCorrelativas)){
        
            System.out.println("El alumno cumple con correlatividades y puede inscribirse a "+ this.materiaAInscribirse.getNombreMateria());
            this.aprobada = true; // se aprobo la inscripcion 
            
        }else{
            System.out.println("El alumno no cumple con correlatividades y no puede inscribirse a "+ this.materiaAInscribirse.getNombreMateria());
                }
   
    }
    
    
    public Alumno getAlumno() {
        return alumno;
    }

    public Materia getMateriaAInscribirse() {
        return materiaAInscribirse;
    }

    public boolean isAprobada() {
        return aprobada;
    }

    public void setAprobada(boolean aprobada) {
        this.aprobada = aprobada;
    }


    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setMateriaAInscribirse(Materia materiaAInscribirse) {
        this.materiaAInscribirse = materiaAInscribirse;
    }   
    
}
