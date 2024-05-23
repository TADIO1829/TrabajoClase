public class Estudiantes {
    String nombre;
    String cedula;
    String correo;
    String Semestre;
    String codigoUnico;
    String materia;
    Double nota;
    Double Total;
    Double Promedio;


    public Estudiantes() {
    }

    public Estudiantes(String nombre,  String codigoUnico, String correo, String semestre, String cedula, String materia, Double nota) {
        this.nombre = nombre;
        this.codigoUnico = codigoUnico;
        this.correo = correo;
        Semestre = semestre;
        this.cedula = cedula;
        this.materia = materia;
        this.nota = nota;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSemestre() {
        return Semestre;
    }

    public void setSemestre(String semestre) {
        Semestre = semestre;
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

   public String getMaterias() {
        return materia;
   }
   public void setMaterias(String materias) {
        this.materia = materias;
   }

   public Double getNota() {
        return nota;
   }
   public void setNotas(Double notas) {
        this.nota = notas;
   }

    public void imprimirDatos() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Cedula: " + this.getCedula());
        System.out.println("Correo: " + this.getCorreo());
        System.out.println("Semestre: " + this.getSemestre());
        System.out.println("Codigo Unico: " + this.getCodigoUnico());



    }
    public void imprimirNotas(){

            System.out.println("Materia: " + this.getMaterias());
            System.out.println("Nota: " + this.getNota());


    }


    public void promedioNotas() {

        Total = 0.0;
        for (int i = 0; i < this.getNota(); i++) {
            Total += this.getNota();
            Promedio = Total/5;
            System.out.println("Promedio: " + Promedio);
        }






    }
}
