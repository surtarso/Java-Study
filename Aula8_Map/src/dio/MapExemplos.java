package dio;

import java.util.*;

public class MapExemplos {
    public static void main(String[] args) {

        System.out.println("criar dicionario com modelo e consumo: ");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("trocar gol pra 15.2: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("existe fusca?: " + carrosPopulares.containsKey("fusca"));

        System.out.println("mostrar consumo do uno: " + carrosPopulares.get("uno"));

        System.out.println("exiba os modelos (keys): ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);
        System.out.println("consumo dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("modelo +eco e consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente))
                modeloMaisEficiente = entry.getKey();
        }
        System.out.println("mais eficiente: " + modeloMaisEficiente + " " + consumoMaisEficiente);

        System.out.println("menos economico e consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()){
            if(entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("menos eff: " + modeloMenosEficiente + " " + consumoMenosEficiente);
            }
        }

        System.out.println("soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("soma: " + soma);

        System.out.println("media de consumo: " + (soma/carrosPopulares.size()));

        System.out.println(carrosPopulares);
        System.out.println("remover modelos com 15.6 de consumo: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("na ordem q foram informados: ");
        Map<String, Double> carrosPopulares1 = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());

        System.out.println("ordena por modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("apagar o dicionario");
        carrosPopulares.clear();
        System.out.println(carrosPopulares);
        System.out.println("dicionario esta vazio?: " + carrosPopulares.isEmpty());
    }
}
