import java.util.Scanner;

public class AgendaBanco {
    public static void main(String[] args) {
        dDatos operacion[]= new dDatos[50];
        //CuentaUsuario operacion[]= new CuentaUsuario[50];

        int y=0;

        Scanner sc = new Scanner(System.in);
        /*for (int l=0;l<=50;l++){
            operacion[l]=new dDatos();

        }*/
        for(int x=1;x>=1;x++) {
            System.out.println("***MENU***");
            System.out.println("1. Registrar");
            System.out.println("2. Movimiento");
            System.out.println("3. Mostrar");
            System.out.println("4. Buscar");
            System.out.println("5. Salir");
            System.out.println("Escribe el numero de la opcion a realizar: ");
            int op = sc.nextInt();
            switch (op){
                case 3:
                    for (int f=0;f<y;f++){
                        System.out.println("\n *MOSTRAR* ");
                        System.out.println("\nID_USUARIO: " + f);
                        operacion[f].Mostrar();
                    }
                    break;
                case 2:
                    System.out.println("\n *MOVIMIENTO* ");
                    System.out.println("Id del usuario para hacer el movimiento (del 0 al "+ (y-1) + ") :");
                    int pos= sc.nextInt();
                    if(pos>(y-1)){
                        System.out.println("No existe ningun usuario con ese ID!!!!");
                    }else{
                        System.out.println(" MOVIMIENTOS:  ");
                        System.out.println("1.Deposito");
                        System.out.println("2.Transferencia");
                        System.out.println("Escribe el numero del movimiento a realizar: ");
                        int op1=sc.nextInt();

                        if (op1==1){
                            operacion[pos].Movimiento();
                        }
                        if (op1==2){
                            operacion[pos].Trans();
                        }
                    }
                    break;
                case 1:
                    //operacion[y]=new dDatos();
                    operacion[y]=new CuentaUsuario();
                    System.out.println("\n *REGISTRAR*\n ");

                    operacion[y].Registrar();
                    y++;
                    break;
                case 4:
                    System.out.println("\n *BUSCAR* ");

                    System.out.println("Id del usuario a buscar (del 0 al "+ (y-1) + ") :");
                    pos= sc.nextInt();
                    if(pos>(y-1)){
                        System.out.println("No existe ningun usuario con ese ID!!!!");
                    }else
                    operacion[pos].Buscar();
                    break;
                case 5:
                    x=-1;
                    break;
            }

        }//fin for


    }
}
