package tagline.model.util;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import tagline.model.contact.Address;
import tagline.model.contact.AddressBook;
import tagline.model.contact.Contact;
import tagline.model.contact.Description;
import tagline.model.contact.Email;
import tagline.model.contact.Name;
import tagline.model.contact.Phone;
import tagline.model.contact.ReadOnlyAddressBook;
import tagline.model.tag.Tag;

/**
 * Contains utility methods for populating {@code AddressBook} with sample data.
 */
public class SampleDataUtil {
    public static Contact[] getSampleContacts() {
        // @formatter:off
        return new Contact[]{
            new Contact(new Name("Alex Yeoh"), new Phone("87438807"), new Email("alexyeoh@example.com"),
                    new Address("Blk 30 Geylang Street 29, #06-40"), new Description("friend")),
            new Contact(new Name("Bernice Yu"), new Phone("99272758"), new Email("berniceyu@example.com"),
                    new Address("Blk 30 Lorong 3 Serangoon Gardens, #07-18"), new Description("friend")),
            new Contact(new Name("Charlotte Oliveiro"), new Phone("93210283"), new Email("charlotte@example.com"),
                    new Address("Blk 11 Ang Mo Kio Street 74, #11-04"), new Description("friend")),
            new Contact(new Name("David Li"), new Phone("91031282"), new Email("lidavid@example.com"),
                    new Address("Blk 436 Serangoon Gardens Street 26, #16-43"), new Description("friend")),
            new Contact(new Name("Irfan Ibrahim"), new Phone("92492021"), new Email("irfan@example.com"),
                    new Address("Blk 47 Tampines Street 20, #17-35"), new Description("friend")),
            new Contact(new Name("Roy Balakrishnan"), new Phone("92624417"), new Email("royb@example.com"),
                    new Address("Blk 45 Aljunied Street 85, #11-31"), new Description("friend"))
        };
    }

    public static ReadOnlyAddressBook getSampleAddressBook() {
        AddressBook sampleAb = new AddressBook();
        for (Contact sampleContact : getSampleContacts()) {
            sampleAb.addContact(sampleContact);
        }
        return sampleAb;
    }

    /**
     * Returns a tag set containing the list of strings given.
     */
    public static Set<Tag> getTagSet(String... strings) {
        return Arrays.stream(strings)
                .map(Tag::new)
                .collect(Collectors.toSet());
    }

}
