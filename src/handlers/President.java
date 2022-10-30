package handlers;

import common.Type;

/**
 * //TODO - Implement approval implementation for President level
 */
public class President extends Approver {
    @Override
    public void approve(int id, double cost, Type type) {
        if (canApprove(id, cost, type)) {
            System.out.println("President approved purchase with id " + id + " that costs " + cost);
        } else {
            System.out.println("Purchase with id " + id + " needs approval from Executive Meeting .");
            next.approve(id, cost, type);
        }

    }

    @Override
    protected boolean canApprove(int id, double cost, Type type) {
        boolean result = false;
        switch (type) {
            case CONSUMABLES:
                if (cost <= 1000) {

                    return result = true;
                } else {
                    break;
                }
            case CLERICAL:
                if (cost <= 2000) {
                    return result = true;
                } else {
                    break;
                }
            case GADGETS:
                if (cost <= 3000) {
                    return result = true;
                } else {
                    break;
                }
            case GAMING:
                if (cost <= 5000) {
                    return result = true;
                } else {
                    break;
                }
            case PC:
                if (cost <= 8000) {
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
