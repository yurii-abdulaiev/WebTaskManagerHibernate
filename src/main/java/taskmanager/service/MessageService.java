package taskmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taskmanager.dao.MessageDAO;

import static java.lang.Integer.parseInt;

/**
 * Created by employee on 11/24/16.
 */
@Service
public class MessageService {

    @Autowired
    MessageDAO messageDAO;

    public void deleteMessage(String mId) {
        messageDAO.deleteMessage(mId);
    }

    public void createMessage(int taskId, String messageText){
        messageDAO.addNewMessage(taskId, messageText);
    }

    public void updateMessage(Integer id, String message) {
        messageDAO.updateMessage(id, message);
    }
}
