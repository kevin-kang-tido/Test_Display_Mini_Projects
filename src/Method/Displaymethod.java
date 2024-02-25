package Method;

import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

public class Displaymethod {
    public static void displayMainMenu() {
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        Table table = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.SURROUND);
        table.addCell("             Disp(l)ay | Rando(m) | (W)rite | (R)ead | (E)dit | (D)elete | (S)earch              ",cellStyle);
        table.addCell("             Set R(o)w | (C)ommit | Bac(k) up | Res(t)ore | (H)elp | E(x)it              ",cellStyle);
        System.out.println(table.render());;
    }
    public static void displayBanner(){
        System.out.println("""
                
                  ██████ ███████ ████████  █████  ██████      ███    ███ ██ ███    ██ ██     ██████  ██████   ██████       ██ ███████  ██████ ████████\s
                 ██      ██         ██    ██   ██ ██   ██     ████  ████ ██ ████   ██ ██     ██   ██ ██   ██ ██    ██      ██ ██      ██         ██   \s
                 ██      ███████    ██    ███████ ██   ██     ██ ████ ██ ██ ██ ██  ██ ██     ██████  ██████  ██    ██      ██ █████   ██         ██   \s
                 ██           ██    ██    ██   ██ ██   ██     ██  ██  ██ ██ ██  ██ ██ ██     ██      ██   ██ ██    ██ ██   ██ ██      ██         ██   \s
                  ██████ ███████    ██    ██   ██ ██████      ██      ██ ██ ██   ████ ██     ██      ██   ██  ██████   █████  ███████  ██████    ██   \s
                                                                                                                                                      \s
                                                                                                                                                      \s
                                 
                """);
    }
    // Simulate loading or waiting for data
    public static void loadData() {
        try {
            String[] animationDos = {".", "..", "..."};
            String[] animation = {"|", "/", "-", "\\"};

            System.out.print("Loading data");
            for (int i= 0 ; i<3 ;i++){
                System.out.print(" " + animationDos[i % animation.length]);
                Thread.sleep(200);
                System.out.print("\b\b");
            }
            for (int i = 0; i < 20; i++) {
                System.out.print(" " + animation[i % animation.length]);
                Thread.sleep(100);
                System.out.print("\b\b");
            }
            System.out.println("\nData loading successfully! ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
