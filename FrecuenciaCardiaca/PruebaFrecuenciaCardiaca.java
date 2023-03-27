import javax.swing.JOptionPane;
/**
 *
 * @author nyyac
 */
public class PuebaFrecuenciaCardiaca {


    public static  void main (String [] args){

        //Scanner entrada = new Scanner(System.in);
        FrecuenciaCardiaca miCardio = new FrecuenciaCardiaca("Carlos","Trejo","07","10",2003,50,150,20);

        System.out.printf("Tu nombre es: "+miCardio.getNombre()+" "+miCardio.getApellido()+"Tu edad es: "+ miCardio.getEdad()+"Tu Frecuencia maxima es: "+ miCardio.getFrecuenciaMax()+
            "Tu Frecuencia esperada es: "+ miCardio.getFrecuenciaEsp());

        String nombre = JOptionPane.showInputDialog( "Escribe tu nombre: ");
        miCardio.setNombre(nombre);

        String apellido = JOptionPane.showInputDialog("Escriba su apellido: ");
        miCardio.setApellido(apellido);

        String dia = JOptionPane.showInputDialog("Escriba su dia de nacimiento: ");
        miCardio.setDia(dia);

        String mes = JOptionPane.showInputDialog("Escribe tu mes de nacimiento: ");
        miCardio.setMes(mes);


        String anio = JOptionPane.showInputDialog("Escribe tu año de nacimiento: ");
        //Se usa como tipo de variable cadena o texto o String; por el cual se cambia a String pero abajo se dara un error ya que es de entero
        //Ahora se hace la conversion a tipo de entero, pero dará error porque tenemos la misma variable de conversion
        int ani = Integer.parseInt(mes);
        //Se cambia la variable para almcenar metiendo ahora lo que ocupamos es que sea entero "int" y el dia ahora le damos el valor "di"
        //y asi enmascaras la conversión y no da error
        miCardio.setAnio(ani);//cambiar tambien

        miCardio.setEdad(ani);
        miCardio.setFrecuenciaMax(miCardio.getEdad());
        miCardio.setFrecuenciaEsp(miCardio.getFrecuenciaMax());

        JOptionPane.showInputDialog(null,"Tu nombre es: "+ miCardio.getNombre()+ " " + miCardio.getApellido()
        + "Tu edad es: " + miCardio.getEdad() + "Tu Frecuencia Maxima es: " +miCardio.getFrecuenciaMax() +
                "Tu frecuencia esperada es: " + miCardio.getFrecuenciaEsp());
    }

}
