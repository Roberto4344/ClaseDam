public class Alumno {

    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;

    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno) {
        nombre = nombreCompleto;
        numeroMatricula = numeroMatriculaAlumno;
        edad = edadAlumno;
    }

    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * devuelve el nummat
     */
    public String getNumMat(){
        return numeroMatricula;
    }

    /**
     * devuelve la edad
     */
    public int getEdad(){
        return edad;
    }
    
    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(nombre + " (" + numeroMatricula + ") - " + edad + " años");
    }

    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres
     */
    public String getNombreUsuarioGithub() {
       String nombreExcep = nombre;
        String matriculaExcep = numeroMatricula;
        if(nombreExcep.length() > 3){
            nombreExcep = nombre.substring(0, 3);
        }
        if(matriculaExcep.length() > 4){
            matriculaExcep = numeroMatricula.substring(0, 4);
        }
        return nombreExcep + matriculaExcep;
    }
}
