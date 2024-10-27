public class Curso {

    private String Curso1;
    private String Curso2;
    private String Curso3;

    public Curso() {
    }

    public Curso(String curso1, String curso2, String curso3) {
        Curso1 = curso1;
        Curso2 = curso2;
        Curso3 = curso3;
    }

    public String getCurso1() {
        return Curso1;
    }

    public void setCurso1(String curso1) {
        Curso1 = curso1;
    }

    public String getCurso2() {
        return Curso2;
    }

    public void setCurso2(String curso2) {
        Curso2 = curso2;
    }

    public String getCurso3() {
        return Curso3;
    }

    public void setCurso3(String curso3) {
        Curso3 = curso3;
    }

    public String detalleCurso (){

        return "El curso 1 es :" + this.Curso1 + ("\n") +
                "El curso 2 es :" + this.Curso2 + ("\n") +
                "El curso 3 es :" + this.Curso3 + ("\n");
    }
}
