package co.devco.semillero.counter;

import co.devco.semillero.model.Summary;

import java.io.IOException;

public interface WordCounter {

    Summary process(String pathFile) throws IOException;
}
