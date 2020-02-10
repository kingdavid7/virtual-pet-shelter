package virtualpetshelter;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldGetHunger() {
		VirtualPet underTest = new VirtualPet("name", "description", 1, 0, 0, 0);
		int hunger = underTest.getHunger();
		assertEquals(1, hunger);
	}

	@Test
	public void shouldGetThirst() {
		VirtualPet underTest = new VirtualPet("name", "description", 0, 1, 0, 0);
		int thirst = underTest.getThirst();
		assertEquals(1, thirst);
	}

	@Test
	public void shouldGetBathroom() {
		VirtualPet underTest = new VirtualPet("name", "description", 0, 0, 1, 0);
		int bathroom = underTest.getBathroom();
		assertEquals(1, bathroom);
	}

	@Test
	public void shouldGetEnergy() {
		VirtualPet underTest = new VirtualPet("name", "description", 0, 0, 0, 1);
		int energy = underTest.getEnergy();
		assertEquals(1, energy);
	}

	@Test
	public void shouldGetStatus() {
		VirtualPet underTest = new VirtualPet("name", "description", 0, 0, 0, 0);
		String status = underTest.getStatus();
		assertEquals("Amazing", status);
	}

	@Test
	public void shouldDecreaseHungerBy10() {
		VirtualPet underTest = new VirtualPet("name", "description", 10, 0, 0, 0);
		underTest.feed(10);
		int hunger = underTest.getHunger();
		assertEquals(0, hunger);
	}

	@Test
	public void shouldDecreaseThirstBy10() {
		VirtualPet underTest = new VirtualPet("name", "description", 0, 10, 0, 0);
		underTest.water(10);
		int thirst = underTest.getThirst();
		assertEquals(0, thirst);
	}

	@Test
	public void shouldDecreaseBathroomBy10() {
		VirtualPet underTest = new VirtualPet("name", "description", 0, 0, 10, 0);
		underTest.letOut(10);
		int bathroom = underTest.getBathroom();
		assertEquals(0, bathroom);
	}

	@Test
	public void shouldDecreaseEnergyBy10() {
		VirtualPet underTest = new VirtualPet("name", "description", 0, 0, 0, 10);
		underTest.play(10);
		int energy = underTest.getEnergy();
		assertEquals(0, energy);
	}

	@Test
	public void shouldDetermineStatusAmazing() {
		VirtualPet underTest = new VirtualPet("name", "description", 0, 0, 0, 0);
		underTest.getStatus();
		String status = underTest.getStatus();
		assertEquals("Amazing", status);
	}

	@Test
	public void shouldDetermineStatusGreat() {
		VirtualPet underTest = new VirtualPet("name", "description", 10, 10, 10, 10);
		underTest.getStatus();
		String status = underTest.getStatus();
		assertEquals("Great", status);
	}

	@Test
	public void shouldDetermineStatusGood() {
		VirtualPet underTest = new VirtualPet("name", "description", 20, 20, 20, 20);
		underTest.getStatus();
		String status = underTest.getStatus();
		assertEquals("Good", status);
	}

	@Test
	public void shouldDetermineStatusContent() {
		VirtualPet underTest = new VirtualPet("name", "description");
		underTest.getStatus();
		String status = underTest.getStatus();
		assertEquals("Content", status);
	}

	@Test
	public void shouldDetermineStatusOkay() {
		VirtualPet underTest = new VirtualPet("name", "description", 40, 40, 40, 40);
		underTest.getStatus();
		String status = underTest.getStatus();
		assertEquals("Okay", status);

	}

	@Test
	public void shouldDetermineStatusBad() {
		VirtualPet underTest = new VirtualPet("name", "description", 45, 45, 45, 45);
		underTest.getStatus();
		String status = underTest.getStatus();
		assertEquals("Bad", status);
	}

	@Test
	public void shouldDetermineStatus() {
		VirtualPet underTest = new VirtualPet("name", "description", 50, 50, 50, 50);
		underTest.getStatus();
		String status = underTest.getStatus();
		assertEquals("dead", status);
	}

	@Test
	public void shouldTick() {
		VirtualPet underTest = new VirtualPet("name", "description", 10, 10, 10, 10);
		underTest.tick();
		underTest.getHunger();
		int hunger = underTest.getHunger();
		assertEquals(15, hunger);
		underTest.getThirst();
		int thirst = underTest.getThirst();
		assertEquals(15, thirst);
		underTest.getBathroom();
		int bathroom = underTest.getBathroom();
		assertEquals(15, bathroom);
		underTest.getEnergy();
		int energy = underTest.getEnergy();
		assertEquals(15, energy);
	}
}
