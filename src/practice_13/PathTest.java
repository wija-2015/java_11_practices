package practice_13;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.*;
import java.time.Instant;
import java.util.Set;

/**
 * @author Wijdane KHATTAT
 */
public class PathTest {
    public static void main(String[] args) throws IOException {
        System.out.println("\n******** Navigating the Filesystem **************");
        //Path pp = Path.of("/", "users", "joe");
        //Files.list(pp).forEach(System.out::println);
        Path userTxtFile = Path.of("D:/Formations/Formations orange/Java_11/OmniAcademy/labs/src/practice_13/user_1.txt");
        for(int i=0; i<userTxtFile.getNameCount(); i++){
            Path p = userTxtFile.getName(i);
            System.out.println(p);
        }


        System.out.println("\n**************** symblicLinkFile *******************");
        Path symblicLinkFile = Path.of("./src/practice_13/s.txt");
        //Files.createSymbolicLink(symblicLinkFile, userTxtFile);
        Path p3 = Files.readSymbolicLink(symblicLinkFile);
        System.out.println("SymbolicLink is "+p3);

        System.out.println("\n***************** list ************************");
        Path srcFolder = Path.of("D:/Formations/Formations orange/Java_11/OmniAcademy/labs/src");
        Files.list(srcFolder).forEach(p -> System.out.println(p));

        System.out.println("\n***************** walk ************************");
        Files.walk(srcFolder).forEach(p -> System.out.println(p));


        System.out.println("\n******** Analyse Path Properties **************");
        System.out.println(Files.isDirectory(userTxtFile));      // false
        System.out.println(Files.isExecutable(userTxtFile));     // true
        System.out.println(Files.isReadable(userTxtFile));       // true
        System.out.println(Files.isWritable(userTxtFile));       // true
        System.out.println(Files.isHidden(userTxtFile));         // false
        System.out.println(Files.isRegularFile(userTxtFile));    // true
        System.out.println(Files.isSymbolicLink(symblicLinkFile));   // true
        System.out.println(Files.isSameFile(userTxtFile, symblicLinkFile));   // true
        System.out.println(Files.probeContentType(userTxtFile)); // text/plain

        System.out.println();
        BasicFileAttributes fa = Files.readAttributes(userTxtFile,BasicFileAttributes.class);
        long size = fa.size();               // 640
        FileTime t1 = fa.creationTime();     // 2019-01-24T14:23:40Z
        FileTime t2 = fa.lastModifiedTime(); // 2019-05-09T20:47:54.438626Z
        FileTime t3 = fa.lastAccessTime();   // 2019-05-10T10:16:18.715692Z
        System.out.println(size);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        System.out.println("\n*************** Create Paths ******************");
        Path source = Path.of("D:/Formations/Formations orange/Java_11/OmniAcademy/labs/src/package_13/");
        Path backup = Path.of("D:/Formations/Formations orange/Java_11/OmniAcademy/labs/src/package_14/files");
        if (Files.notExists(backup)) {
            Files.createDirectories(backup);
        }
        Path readme = backup.resolve("../readme.txt").normalize();
        //Files.createFile(readme);
        Files.writeString(readme,"Backup time: "+Instant.now());
        Files.lines(readme, Charset.forName("UTF-8")).forEach(line->System.out.println(line));

        System.out.println("\n*************** Create Temporary Files/Folders ******************");
        Path p1 = Files.createTempDirectory("TEMP");
        Path p2 = Files.createTempFile(p1, "TEMP",".tmp");
        Files.deleteIfExists(p2);
        Files.deleteIfExists(p1);


        System.out.println("******** Path **************");
        Path someFile = Path.of("/", "users", "joe", "docs", "some.txt");
        Path justSomeFile = someFile.getFileName();
        Path docsFolder = someFile.getParent();
        Path currentFolder = Path.of(".");
        Path acmeFile = docsFolder.resolve("../pics/acme.jpg");
        Path otherFile = someFile.resolveSibling("other.txt");
        Path normalisedAcmeFile = acmeFile.normalize();
        Path betweenSomeAndAcme = someFile.relativize(acmeFile);
        //Path verifiedPath = acmeFile.toRealPath();
        System.out.println(someFile);
        System.out.println(justSomeFile);
        System.out.println(docsFolder);
        System.out.println(currentFolder);
        System.out.println(acmeFile);
        System.out.println(otherFile);
        System.out.println(normalisedAcmeFile);
        System.out.println(betweenSomeAndAcme);
        System.out.println(someFile.toAbsolutePath());
        //System.out.println(verifiedPath);




    }
}
