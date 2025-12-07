package net.drizzlehx.journalApp.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Document(collection = "journal_entries")
public class journalEntry
{
    @Id
    private ObjectId id;
    private String title;
    private LocalDateTime date;
    private String content;

//    public LocalDateTime setDate(LocalDateTime now)
//    {
//        return LocalDateTime.now();
//    }
}
