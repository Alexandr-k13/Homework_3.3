package geekbrains;

import java.io.*;
import java.util.List;

import static com.sun.org.apache.xml.internal.serializer.utils.Utils.messages;

public class SaveMessages {
    private static String FILE_ARCHIVE_TEMPLATE;
    "#archive.log";
    private static String archiveFileName;
    private static String archiveWriter;
    private final SaveMessages;
    private static final long NUM_LAST_MESSAGES = 100;
    private Object SaveMessages;
    private String setArchiveFileName;
    ;

    public Object SaveMessages(SaveMessages) {
        this.SaveMessages = SaveMessages;
    }

    public void setArchiveFileName(String userName) {
        this.setArchiveFileName = userName + FILE_ARCHIVE_TEMPLATE;

    }

    public static void putMessagetoArchiveFile(String message) throws IOException {
        if (archiveWriter == null) {
            archiveWriter = new String(String.valueOf(new FileWriter(archiveFileName, true)));
        }
        archiveWriter.write(message);
        archiveWriter.newLine();

    }

    public static List getArchiveFromeFile(long numLastMassages) throws IOException {
        List<String> messages =new List<>();
        try (FileInputStream fis = new FileInputStream(archiveFileName)) ;


        BufferedReader br = new BufferedReader(new FileInputStream);
        String str;
        long i = numLastMassages;
        while ((str = br.readline()) ! = null; &&i > 0){
            messages.add(str);
            i--;
        }
    }

    returne messages;
}
public List getMassageArchive() throws IOException {
    List<String> messages = SaveMessages.getArchiveFromeFile(NUM_LAST_MESSAGES);
    returne messages;
}
public void close(){
    if (archiveWriter == null )
return;
try {
    archiveWriter.close();
} catch (IOException e) {
    e.printStackTrace();
}

}
    
}

