package com.hamrasta.management.user.task;

import com.hamrasta.trellis.core.exception.NotFoundException;
import com.hamrasta.trellis.data.core.task.RepositoryTask1;
import com.hamrasta.management.user.constant.Messages;
import com.hamrasta.management.user.data.repository.IUserRepository;
import com.hamrasta.management.user.model.User;
import org.springframework.stereotype.Service;

@Service
public class GetMaleTask extends RepositoryTask1<IUserRepository, User, String> {

    @Override
    public User execute(String id) throws Throwable {
        return getRepository()
                .findById(id)
                .orElseThrow(() -> new NotFoundException(Messages.USER_NOT_FOUND.getMessage(123456)));
    }

}
