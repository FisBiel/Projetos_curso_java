import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comentarios;
import entities.Postagem;

public class App {
    public static void main(String[] args) throws ParseException {

        Comentarios c1 = new Comentarios("Have a nice trip!");
        Comentarios c2 = new Comentarios("Wow that's awesome!");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Postagem p1 = new Postagem(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand",
                "I'm going to visit this worderful country!", 12);

        p1.addComentario(c1);
        p1.addComentario(c2);

        System.out.println(p1);

        Comentarios c3 = new Comentarios("Good night");
        Comentarios c4 = new Comentarios("May the Force be with you");

        Postagem p2 = new Postagem(
                sdf.parse("28/07/2018 23:14:19"),
                "good night guys",
                "see you tomorrow",
                5);
        p2.addComentario(c3);
        p2.addComentario(c4);

        System.out.println(p2);

    }
}
