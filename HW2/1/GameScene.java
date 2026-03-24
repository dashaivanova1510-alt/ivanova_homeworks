private final List<Cacodemon> cacodemons = new ArrayList<>();

case CACODEMON:
    cacodemons.add(new Cacodemon(level));
    break;

for (Cacodemon c : cacodemons) c.shoot();
