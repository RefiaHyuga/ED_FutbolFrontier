package org.angela.futbolfrontier;
import java.util.ArrayList;
import java.util.List;

public class Liga {
    private List<Equipo> equipos;
    private List<Partido> partidos;

    // Constructor
    public Liga() {
        equipos = new ArrayList<Equipo>();
        partidos = new ArrayList<Partido>();
    }

    // Método para registrar un equipo
    public void registrarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    // Método para registrar goles y actualizar estadísticas
    public void registrarPartido(Partido partido) {
        partidos.add(partido);
       // Actualizar goles de los equipos
        partido.getEquipoLocal().setGolesAFavor(partido.getEquipoLocal().getGolesAFavor() + partido.getGolesLocal());
        partido.getEquipoVisitante().setGolesAFavor(partido.getEquipoVisitante().getGolesAFavor() + partido.getGolesVisitante());
        partido.getEquipoLocal().setGolesEnContra(partido.getEquipoLocal().getGolesEnContra() + partido.getGolesVisitante());
        partido.getEquipoVisitante().setGolesEnContra(partido.getEquipoVisitante().getGolesEnContra() + partido.getGolesLocal());

        // Actualizar puntos
        if (partido.getGolesLocal() > partido.getGolesVisitante()) {
            partido.getEquipoLocal().setPuntos(partido.getEquipoLocal().getPuntos() + 3); // Victoria local
        } else if (partido.getGolesVisitante() > partido.getGolesLocal()) {
            partido.getEquipoVisitante().setPuntos(partido.getEquipoVisitante().getPuntos() + 3); // Victoria visitante
        } else {
            partido.getEquipoLocal().setPuntos(partido.getEquipoLocal().getPuntos() + 1); // Empate
            partido.getEquipoVisitante().setPuntos(partido.getEquipoVisitante().getPuntos() + 1);
        }
    }

    // Mostrar clasificación
    public void mostrarClasificacion() {
        equipos.sort((e1, e2) -> {
            if (e2.getPuntos() != e1.getPuntos()) {
                return Integer.compare(e2.getPuntos(), e1.getPuntos());
            }
            return Integer.compare(e2.getDiferenciaDeGoles(), e1.getDiferenciaDeGoles());
        });

        System.out.println("Clasificación:");
        for (int i=0; equipos.size()>i;i++) {
            Equipo e=equipos.get(i);
            System.out.println(e);
        }
    }

    // Buscar un equipo por nombre y me devuelve el equipo
    public Equipo buscarEquipo(String nombre) {
        for (int i=0; equipos.size()>i;i++) {
            if (equipos.get(i).getNombre().equals(nombre)) {
                Equipo e=equipos.get(i);
                System.out.println(e);
                return e;
            }
        }
        System.out.println("Equipo no encontrado.");
        return null;
    }

    // Listar todos los partidos jugados
    public void listarPartidos() {
        System.out.println("Partidos jugados:");
        for (int i=0; partidos.size()>i;i++) {
            Partido p = partidos.get(i);
            System.out.println(p);
        }
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }

}
