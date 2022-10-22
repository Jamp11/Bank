import java.util.Scanner;

public class dDatos {
    //public int idusuario;
    public String Nombre;
    public String aPaterno;
    public String aMaterno;
    public String numeroCuenta;
    public float saldo;
    float depo;
    Scanner sc = new Scanner(System.in);

    //metodos
    public void Registrar(){
        System.out.println("Dame tu nombre");
        Nombre= sc.nextLine();
        System.out.println("Dame tu apellido paterno");
        aPaterno= sc.nextLine();
        System.out.println("Dame tu apellido materno");
        aMaterno= sc.nextLine();
        System.out.println("Dame tu numero de cuenta");
        numeroCuenta= sc.nextLine();
        System.out.println("Dame tu saldo");
        saldo= sc.nextFloat();
       /* System.out.println("Nombre: " + Nombre);
        System.out.println("Apellido Paterno: " + aPaterno);
        System.out.println("Apellido Materno: " + aMaterno);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("ID_USUARIO: " + idusuario);*/

    };
    public void Mostrar(){
        //System.out.println("\nID_USUARIO: "3 + idusuario);
        System.out.println("Nombre: " + Nombre);
        System.out.println("Apellido Paterno: " + aPaterno);
        System.out.println("Apellido Materno: " + aMaterno);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
    };
    public void Movimiento(){
            System.out.println("Escribe la cantidad a depositar: ");
            float depo=sc.nextFloat();
            saldo=saldo+depo;
            System.out.println("Tu saldo nuevo es: "+saldo);
    };
    public void Trans(){
        System.out.println("Escribe la cantidad a transferir: ");
        depo=sc.nextFloat();
        saldo=saldo-depo;
        System.out.println("Tu saldo nuevo es: "+saldo);
    };
    public void Buscar(){
        //System.out.println("\nID_USUARIO: " + idusuario);
        System.out.println("Nombre: " + Nombre);
        System.out.println("Apellido Paterno: " + aPaterno);
        System.out.println("Apellido Materno: " + aMaterno);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
    };

}
