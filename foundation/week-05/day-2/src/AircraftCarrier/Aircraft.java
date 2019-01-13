package AircraftCarrier;

public class Aircraft {

    protected int ammo;
    protected int maxAmmo;
    protected int baseDamage;
    protected int allDamage;
    protected boolean priority;

    public Aircraft() {
        ammo = 0;
    }

    public int fight() {
        int damage = baseDamage * ammo;
        ammo = 0;
        allDamage += damage;
        return damage;
    }

    public int refill(int amount) {
        if (amount > maxAmmo - ammo) {
            ammo = maxAmmo;
            return amount - maxAmmo;
        }
        ammo += amount;
        return 0;
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    public String getStatus() {
        return String.format("Type %s, Ammo: %d, Base Damage: %d, All Damage: %d",
                getClass().getSimpleName(), ammo, baseDamage, allDamage);
    }

    public boolean isPriority() {
        return priority;
    }


}
