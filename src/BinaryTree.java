
class Node{
    int datos;
    Node izquierda;
    Node derecha;
}

public class BinaryTree {

    public Node crearNuevoNodo(int valor ){
        Node node = new Node();
        node.datos = valor;
        node.izquierda = null;
        node.derecha = null;

        return node;
    }
    public Node insertar(Node node, int valor){
        if(node == null){
            System.out.println(valor);
            //return crearNuevoNodo(valor);
        }
        if(valor < node.datos){
            node.izquierda = insertar(node.izquierda, valor);
            //System.out.println(valor + "     ");

        }
        if(valor > node.datos){
            node.derecha = insertar(node.derecha, valor);
            //System.out.println(valor);
        }

        return node;
    }

}
