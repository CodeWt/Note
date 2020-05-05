package basic.fun_program;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: wtt
 * @Date: 20-4-21
 * @Description:
 */

public class WordConnect {

    // 将单词的首字母大写
    public String capitalizeFirstLetter( String s ) {
        return s.substring(0,1).toUpperCase() + s.substring(1,s.length() );
    }

    // 连词成句
    public String connectWord( List<String> context ) {
        StringBuilder result = new StringBuilder();
        for ( String word: context ) {
            if ( word.length() > 1 ) {
                result.append( capitalizeFirstLetter(word) );
                result.append("-");
            }
        }
        return result.substring(0,result.length()-1).toString();
    }

    public String connectWord1( List<String> context ) {
        return context.stream().filter( w -> w.length()>1 )
                .map( w -> capitalizeFirstLetter(w) )
                .collect( Collectors.joining("-") );
    }
    
    // main()函数
    public static void main(String[] args) {
        List<String> wordList = new ArrayList<String>() {{
            add("The"); add("Products"); add("of"); add("Samsung"); add("and"); add("Apple");
            add("are"); add("so"); add("amazing"); add("especially"); add("Apple");
        }};

        WordConnect wordConnect = new WordConnect();
        String res = wordConnect.connectWord1( wordList );
        System.out.print(res); // 打印：The-Products-Of-Samsung-And-Apple-Are-So-Amazing-Especially-Apple
    }
}

