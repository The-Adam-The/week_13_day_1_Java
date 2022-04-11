package Itinery.Manifest;

import People.crew.CabinCrewMember;

import java.util.ArrayList;

public class FlightAttendantManifest extends Manifest {

    private ArrayList<CabinCrewMember> manifest;

    public FlightAttendantManifest() {
        this.manifest = new ArrayList<>();
    }

    public void addFlightAttendantToManifest(CabinCrewMember flightAttendant) {
        this.manifest.add(flightAttendant);
    }

    public CabinCrewMember getCrewMemberFromManifestIndex(int manifestIndex){
        return manifest.get(manifestIndex);
    }

}
