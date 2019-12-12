public class TesteLampada {

    public static void main(String[] args) {
        
        Lampada lamp = new Lampada();
        
        lamp.setTipo("Fluorescente");
        lamp.setPotencia(500);
        lamp.setAcesa(true);
    
        System.out.println(lamp.toString());
        
        Lampada lamp2 = new Lampada();
        
        lamp2.setTipo("LED");
        lamp2.setPotencia(700);
        lamp2.setAcesa(false);
        
        System.out.println("--------------------");
        
        System.out.println(lamp.toString());
    }
}
