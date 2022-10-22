import java.util.Scanner;

public class CuentaUsuario extends dDatos{
    Scanner sc=new Scanner(System.in);
    //Atributos
    public String Calle;
    public String Colonia;
    public String CodigoPostal;
    public String Municipio;
    public String Pais;
    public String Telefono;
    public String NumCredito;
    public String NumNomina;
    public String Prestamo;
    public boolean TarjetaCredito;
    public boolean TarjetaNomina;
    public boolean Prestamos;
    public int TC, TN, P;
    /*public int opCredito;
    public int opNomina;
    public int opPrestamo;*/


    public void Registrar(){
        super.Registrar();
        System.out.println("Dame tu Calle: ");
        Calle= sc.nextLine();
        System.out.println("Dame tu Colonia: ");
        Colonia= sc.nextLine();
        System.out.println("Dame tu Codigo Postal: ");
        CodigoPostal= sc.nextLine();
        System.out.println("Dame tu Municipio:");
        Municipio= sc.nextLine();
        System.out.println("Dame tu Pais");
        Pais= sc.nextLine();
        System.out.println("Dame tu Telefono: ");
        Telefono= sc.nextLine();
        System.out.println("Si tienes Tarjeta de credito presiona 1. ");
        //opCredito= sc.nextInt();
        TC=sc.nextInt();
        if(TC==1) {
            TarjetaCredito=true;
        }else { TarjetaCredito=false; }
        /*if (opCredito == 1) {
            System.out.println("Dame tu Numero de Credito: ");
            sc.nextLine();
            NumCredito= sc.nextLine();
        }*/
        System.out.println("Si tienes Nomina presiona 1.  ");
        //opNomina= sc.nextInt();
        TN=sc.nextInt();
        if(TN==1) {
            TarjetaNomina=true;
        }else { TarjetaNomina=false; }

        /*if (opNomina==1){
            System.out.println("Dame tu Numero de Nomina:");
            sc.nextLine();
            NumNomina= sc.nextLine();
        }*/
        System.out.println("Si tienes Prestamo presiona 1.");
        //opPrestamo= sc.nextInt();
        P=sc.nextInt();
        if(P==1)
        {
            Prestamos=true;
        }else { Prestamos=false; }
        /*if (opPrestamo==1){
            System.out.println("Dame tu Prestamo: ");
            sc.nextLine();
            Prestamo= sc.nextLine();
        }*/

    }
    public void Mostrar(){
        super.Mostrar();
        System.out.println("Calle: " + Calle);
        System.out.println("Colonia: " + Colonia);
        System.out.println("Codigo Postal: " + CodigoPostal);
        System.out.println("Municipio: " + Municipio);
        System.out.println("Pais: " + Pais);
        System.out.println("Telefono: " + Telefono);
        String tc,tn,pr;
        if (TarjetaCredito==true) {
            tc="Si";
        } else {
            tc="No";
        }
        if (TarjetaNomina==true) {
            tn="Si";
        } else {
            tn="No";
        }
        if (Prestamos==true) {
            pr="Si";
        } else {
            pr="No";
        }
        System.out.println("Credito: " + tc);
        System.out.println("Nomina: " + tn);
        System.out.println("Prestamo: " + pr);
    }
    public void Buscar(){
        super.Buscar();
        System.out.println("Calle: " + Calle);
        System.out.println("Colonia: " + Colonia);
        System.out.println("Codigo Postal: " + CodigoPostal);
        System.out.println("Municipio: " + Municipio);
        System.out.println("Pais: " + Pais);
        System.out.println("Telefono: " + Telefono);
        String tc,tn,pr;
        if (TarjetaCredito==true) {
            tc="Si";
        } else {
            tc="No";
        }
        if (TarjetaNomina==true) {
            tn="Si";
        } else {
            tn="No";
        }
        if (Prestamos==true) {
            pr="Si";
        } else {
            pr="No";
        }
        System.out.println("Credito: " + tc);
        System.out.println("Nomina: " + tn);
        System.out.println("Prestamo: " + pr);
    }
    public void Movimiento(){
        super.Movimiento();
    }
    public void Trans(){
        super.Trans();
    }

}
