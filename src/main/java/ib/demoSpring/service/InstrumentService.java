package ib.demoSpring.service;

import ib.demoSpring.dao.CornemuseDAO;
import ib.demoSpring.dao.GuitareDAO;
import ib.demoSpring.dao.PianoDAO;
import ib.demoSpring.entity.Guitare;
import ib.demoSpring.entity.Instrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InstrumentService {

    @Autowired
    private GuitareDAO guitareDAO;
    @Autowired
    private PianoDAO pianoDAO;
    @Autowired
    private CornemuseDAO cornemuseDAO;


    public List<Instrument> findAllInstrument(){
        List<Instrument> instruments = new ArrayList<Instrument>();
        instruments.addAll( this.guitareDAO.findAll());
        instruments.addAll( this.pianoDAO.findAll());
        instruments.addAll( this.cornemuseDAO.findAll());

        return instruments;
    }


}
