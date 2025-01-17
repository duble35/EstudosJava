import java.util.Stack;

public class Pilhas {

    public static void main(String[] args) {
        Stack<String> uf = new Stack<>();
        uf.push("PA");
        uf.push("BA");
        uf.pop();
        if (uf.empty()) {
            System.out.println("A pilha está vazia");
        } else {
            for (String ufs : uf) {
                System.out.println(ufs);
            }
        }
    }

}
