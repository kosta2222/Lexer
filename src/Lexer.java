
import java.util.HashMap;
import java.util.Map;

//https://github.com/kosta2222/Lexer.git
class Lexer{
private Map symbols;
private Map words;

public Lexer(){
symbols=new HashMap<String,String>();
words=new HashMap<String,String>();
symbols.put("{","LBRA");
symbols.put("}","RBRA");
symbols.put("=","EQUAL");
symbols.put(";","SEMICOLON");
symbols.put("(","LPAR");
symbols.put(")","RPAR");
symbols.put("+","PLUS");
symbols.put("-","MIMNUS");
symbols.put("<","LESS");

words.put("if","IF");
words.put("else","ELSE");
words.put("do","DO");
words.put("while","WHILE");


}
}