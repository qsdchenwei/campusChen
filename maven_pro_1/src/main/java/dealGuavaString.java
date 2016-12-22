import com.google.common.base.Joiner;

/**
 * Created by yangyening on 2016/11/8.
 */
public class dealGuavaString {
    public String dealJoinerString(){
        Joiner joiner=Joiner.on(";").skipNulls();
        return joiner.join("ac",null,"a","a0");
    }
}
