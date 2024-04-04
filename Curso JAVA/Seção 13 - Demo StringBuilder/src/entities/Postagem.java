package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Postagem {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date momento;
    private String titulo;
    private String content;
    private Integer likes;

    private List<Comentarios> comentarios = new ArrayList<>();

    public Postagem() {
    }

    public Postagem(Date momento, String titulo, String content, Integer likes) {
        this.momento = momento;
        this.titulo = titulo;
        this.content = content;
        this.likes = likes;
    }

    public Date getMomentos() {
        return momento;
    }

    public void setMomentos(Date momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comentarios> getComentarios() {
        return comentarios;
    }

    public void addComentario(Comentarios comentario) {
        comentarios.add(comentario);
    }

    public void removeComentario(Comentarios comentario) {
        comentarios.remove(comentario);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(titulo + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(momento) + "\n");
        sb.append(content + "\n");
        sb.append("Comentarios: \n");
        for (Comentarios c : comentarios) {
            sb.append(c.getTexto() + "\n");
        }
        return sb.toString();
    }

}
