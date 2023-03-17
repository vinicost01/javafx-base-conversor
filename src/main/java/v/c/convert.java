package v.c;

public class convert {
    public void decimal_c(int x){
        setget.setDecimal(Integer.toString(x));
        String b = Integer.toString(x, 2);
        setget.setBinario(b);
        String h = Integer.toString(x, 16);
        setget.setHexa(h);
        String o = Integer.toString(x, 8);
        setget.setOctal(o);
    }
    public void binario_c(int b){
        setget.setBinario(Integer.toString(b));
        int x = Integer.parseInt(String.valueOf(b), 2);
        setget.setDecimal(Integer.toString(x));
        String h = Integer.toString(x, 16);
        setget.setHexa(h);
        String o = Integer.toString(x, 8);
        setget.setOctal(o);
    }
    public void hexa_c(String h){
        setget.setHexa(h);
        int x = Integer.parseInt(h,16);
        setget.setDecimal(Integer.toString(x));
        String b = Integer.toString(x, 2);
        setget.setBinario(b);
        String o = Integer.toString(x, 8);
        setget.setOctal(o);
    }
    public void octal_c(String o){
        setget.setOctal(o);
        int x = Integer.parseInt(o,8);
        setget.setDecimal(Integer.toString(x));
        String b = Integer.toString(x, 2);
        setget.setBinario(b);
        String h = Integer.toString(x, 16);
        setget.setHexa(h);
    }
}
