package handlers;

import common.Type;

/**
 * //TODO - If needed, validate logic and if possible optimize code.
 */
public class Director extends Approver {

    @Override
    public void approve(int id, double cost, Type type) {
        if (canApprove(id, cost, type)) {
            System.out.println("Director approved purchase with id " + id + " that costs " + cost);
        } else {
            System.out.println("Purchase with id " + id + " needs approval from higher position than Director.");
            next.approve(id, cost, type);
        }

    }

    @Override
    protected boolean canApprove(int id, double cost, Type type) {
        boolean result = false;

        switch (type) {
            case CONSUMABLES:
                if (cost <= 500) {
                    return result = true;
                } else {
                    break;
                }
            case CLERICAL:
                if (cost <= 1000) {
                    return result = true;
                } else {
                    break;
                }
            case GADGETS:
                if (cost <= 1500) {
                    return result = true;
                } else {
                    break;
                }
            case GAMING:
                if (cost <= 3500) {
                    return result = true;
                } else {
                    break;
                }
            case PC:
                if (cost <= 6000) {
                    result = true;
                    return result = true;
                } else {
                    break;
                }
            default:
                return false;
        }
        return false;
    }
}
