package v.c;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class ConvertTela {
    public TextField decimal_txt;
    public TextField binario_txt;
    public TextField hexa_txt;
    public TextField octal_txt;

    public void convert_btn(ActionEvent actionEvent) {

        convert convert=new convert();

        if(decimal_txt.getText() != "") {
            int x= Integer.parseInt(decimal_txt.getText());
            convert.decimal_c(x);
        }
        if(binario_txt.getText() != "") {
            int x= Integer.parseInt(binario_txt.getText());
            convert.binario_c(x);
        }
        if(hexa_txt.getText() != "") {
            String x= hexa_txt.getText();
            convert.hexa_c(x);
        }
        if(octal_txt.getText() != "") {
            String x= octal_txt.getText();
            convert.octal_c(x);
        }

        att();
    }

    public void limpar_btn(ActionEvent actionEvent) {
        decimal_txt.setText("");
        binario_txt.setText("");
        hexa_txt.setText("");
        octal_txt.setText("");
    }
    public void att(){
        decimal_txt.setText(setget.getDecimal());
        binario_txt.setText(setget.getBinario());
        hexa_txt.setText(setget.getHexa());
        octal_txt.setText(setget.getOctal());
    }
}
