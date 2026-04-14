public class Vendedor {
    public String nombre;
    public String area;
    private double monto;
    private double comision;
    private double cumplimiento;

    public Vendedor(String nombre,String area,double monto,double comision,double cumplimiento){
        this.nombre=nombre;
        this.area=area;
        this.monto=monto;
        this.comision=comision;
        this.cumplimiento=cumplimiento;
    }
    public void setMonto(double monto){
        if (monto>0){
            this.monto=monto;
        }else{
            this.monto=0;
        }
    }
    public void setComision(double comision){
        if (comision>=0){
            this.comision= comision;
        }else{
            this.comision=0;
        }
    }
    public void setCumplimiento(double cumplimiento){
        if(cumplimiento>=0 && cumplimiento>=100){
            this.cumplimiento=cumplimiento;
        }else{
            this.cumplimiento=0;
        }
    }
    public double getMonto(){
        return monto;
    }

    public double calcularComision() {
        return monto * comision/100;
    }
    public double total(){
        return monto + calcularComision();
    }
    public String estado(){
        if (cumplimiento >=90)
            return "Excelente";
        else if (cumplimiento>=70)
            return "Aceptable";
        else
            return "Bajo";

    }
    public String mensaje(){
        if (cumplimiento>=90)
            return "Vendedor con desempeño sobresaliente";
        else if (cumplimiento>=70)
            return "Vendedor con desempeño aceptable";
        else
            return "Se requiere seguimiento comercial";
    }
    public void mostrar(){
        System.out.println("/////INFORME////////");
        System.out.println("Nombre:"+nombre);
        System.out.println("Area:"+area);
        System.out.println("Comision:"+comision);
        System.out.println("Total:"+total());
        System.out.println("Estado:"+estado());
        System.out.println("Mensaje:"+mensaje());
        System.out.println("//////////////////////";

    }
}
