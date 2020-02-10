package virtualpetshelter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {
	
	VirtualPetShelter underTest;
	
	@Before
	public void setUp() {
		underTest = new VirtualPetShelter();	
	}
	
	@Test
	public void shouldInitiateVirtualPetShelter() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		assertNotNull(underTest);
	}

	@Test
	public void ShouldAddPet() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet pet = new VirtualPet("Bolt", "description", 0, 0, 0, 0);
		underTest.addPet(pet);
		int check = underTest.showPetsSize();
		assertSame(1, check);
	}

	@Test
	public void shouldGetPetByName() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet pet = new VirtualPet("Bolt", "description", 0, 0, 0, 0);
		underTest.addPet(pet);
		VirtualPet petTested = underTest.getPetByName("Bolt");
		assertSame(pet, petTested);
	}

	@Test
	public void ShouldShowPetsSize() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet pet = new VirtualPet("Bolt", "description", 0, 0, 0, 0);
		underTest.addPet(pet);
		VirtualPet pet2 = new VirtualPet("Bunny", "description", 0, 0, 0, 0);
		underTest.addPet(pet2);
		int check = underTest.showPetsSize();
		assertSame(2, check);
	}

	@Test
	public void shouldAdoptPet() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		String petName = "Bolt";
		VirtualPet pet = new VirtualPet(petName, "description", 0, 0, 0, 0);
		underTest.addPet(pet);
		underTest.adoptPet(petName);
		VirtualPet retrieved = underTest.getPetByName(petName);
		assertEquals(null, retrieved);
	}

	@Test
	public void shouldFeedPets() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet pet1 = new VirtualPet("Bolt", "description", 10, 0, 0, 0);
		underTest.addPet(pet1);
		VirtualPet pet2 = new VirtualPet("Bunny", "description", 15, 0, 0, 0);
		underTest.addPet(pet2);
		underTest.feedAllPets();
		assertEquals(0, pet1.getHunger());
		assertEquals(5, pet2.getHunger());
	}

	@Test
	public void shouldWaterAllPets() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet pet1 = new VirtualPet("Simba", "LionKing", 0, 14, 0, 0);
		underTest.addPet(pet1);
		VirtualPet pet2 = new VirtualPet("Bunny", "RabbitCop", 0, 26, 0, 0);
		underTest.addPet(pet2);
		underTest.waterAllPets();
		assertEquals(4, pet1.getThirst());
		assertEquals(16, pet2.getThirst());
	}

	@Test
	public void shouldLetOutAllPets() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet pet1 = new VirtualPet("Simba", "LionKing", 0, 0, 10, 0);
		underTest.addPet(pet1);
		VirtualPet pet2 = new VirtualPet("Bunny", "RabbitCop", 0, 0, 10, 0);
		underTest.addPet(pet2);
		underTest.letOutAllPets();
		assertEquals(0, pet1.getBathroom());
		assertEquals(0, pet2.getBathroom());
	}

	@Test
	public void shouldPlayWithAllPets() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet pet1 = new VirtualPet("Simba", "LionKing", 0, 0, 0, 10);
		underTest.addPet(pet1);
		VirtualPet pet2 = new VirtualPet("Bunny", "RabbitCop", 0, 0, 0, 10);
		underTest.addPet(pet2);
		underTest.playWithAllPets();
		assertEquals(0, pet1.getEnergy());
		assertEquals(0, pet2.getEnergy());
	}

	@Test
	public void shouldTickAllPets() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet pet1 = new VirtualPet("Simba", "LionKing", 0, 15, 0, 0);
		underTest.addPet(pet1);
		VirtualPet pet2 = new VirtualPet("Bunny", "RabbitCop", 0, 25, 0, 0);
		underTest.addPet(pet2);
		underTest.tickAllPets();
		assertEquals(20, pet1.getThirst());
		assertEquals(30, pet2.getThirst());
	}

	@Test
	public void shouldPlayWithOnePet() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet pet1 = new VirtualPet("Simba", "LionKing", 0, 0, 0, 30);
		underTest.addPet(pet1);
		VirtualPet pet2 = new VirtualPet("Bunny", "RabbitCop", 0, 0, 0, 40);
		underTest.addPet(pet2);
		underTest.playWithPetByName("Simba");
		assertEquals(15, pet1.getEnergy());
		assertEquals(40, pet2.getEnergy());
	}

}
