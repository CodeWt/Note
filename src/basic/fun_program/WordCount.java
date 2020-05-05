package basic.fun_program;

import java.util.*;

/**
 * @Author: wtt
 * @Date: 20-4-21
 * @Description:
 */
public class WordCount {

    // 定义一个助词集合，这些单词不参与计数
    private Set<String> auxiliaryWordSet = new HashSet<String>() {{
        add("of"); add("the"); add("to"); add("and"); add("so"); add("are");
    }};

    // 传统命令式解法实现的词频统计函数
    public Map doWordCount(List<String> context ) {
        Map<String,Integer> result = new HashMap<String, Integer>();
        for ( String word:context ) {  // 循环迭代
            String lowerCaseWord = word.toLowerCase();  // 将单词统一转换为小写
            if( !auxiliaryWordSet.contains(lowerCaseWord) ) {
                if( null == result.get(lowerCaseWord) )
                    result.put( lowerCaseWord, 1 );
                else
                    result.put( lowerCaseWord, result.get(lowerCaseWord)+1 );
            }
        }
        return result;
    }


    public Map doWordCount2( List<String> context ) {
        Map<String,Integer> result = new HashMap<String, Integer>();
        context.stream().map( w -> w.toLowerCase() )
                .filter( w -> !auxiliaryWordSet.contains(w) )
                .forEach( w -> result.put( w, result.getOrDefault(w,0) + 1 ) );
        return result;
    }

    // main() 函数
    public static void main(String[] args) {
        List<String> wordList = new ArrayList<String>() {{
            add("The"); add("Products"); add("of"); add("Samsung"); add("and"); add("Apple");
            add("are"); add("so"); add("amazing"); add("especially"); add("Apple");
        }};

        WordCount wordCount = new WordCount();
        Map res = wordCount.doWordCount2( wordList );
        System.out.print(res); // 打印：{apple=2, amazing=1, samsung=1, especially=1, products=1}


    }
}

