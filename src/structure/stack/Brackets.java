package structure.stack;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 基于栈的括号匹配功能
 * </p >
 *
 * @author wujianlong
 * @package stack
 * @date 2019-10-24 10:45
 * @copyright: Copyright (c) 2019
 * @version: V1.0.0
 */
public class Brackets {
    private static Map<Character, Character> map = new HashMap<>();

    static {
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');
    }

    StackArray<Character> stackArray = new StackArray(10, Character.class);

    public boolean isRight(String str) {
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if (aChar == '{' || aChar == '[' || aChar == '(') {
                stackArray.push(aChar);
            } else {
                Character pop = stackArray.pop();
                if (null == pop || map.get(pop) != aChar) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Brackets brackets = new Brackets();
        System.out.println(brackets.isRight("{[][]]()}"));
    }
}
