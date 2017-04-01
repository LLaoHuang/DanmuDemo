package nihao;

/**
 * Created by hsy on 2017/4/1.
 */
public class PinyinUtils {
    String a="nihao";
    String b="nibuhao";
                     String c="dajiadoubuhao";
    public String  getwords(int t){
        if(t==1){
            return a;
        }
        if(t==2){
            return b;

        }else{
            return c;
        }
    }
}
