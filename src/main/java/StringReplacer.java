public class StringReplacer implements StringTransformer{
    private char current,replace;
    public StringReplacer(char a, char b) {
        this.current = a;
        this.replace = b;
    }
    public char getcurr(){
        return this.current;
    }
    public char getReplace(){
        return this.replace;
    }

    @Override
    public void execute(StringDrink drink) {
        String str = drink.getText().replace(getcurr(),getReplace());
        drink.setText(str.toString());
    }
}
