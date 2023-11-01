
package entrega1.entidades;

import java.util.List;

public class Materia {
    
    private String nombreMateria;
    private List<Materia> correlativas;

    public Materia() {
    }

    public Materia(String nombreMateria, List<Materia> correlativas) {
        this.nombreMateria = nombreMateria;
        this.correlativas = correlativas;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public void mostrarCorrelatividades(){
        
        for(Materia aux : correlativas){
            System.out.println("- "+ aux);
        }
    }
    
}
