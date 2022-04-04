package waa.lab1.lab1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import waa.lab1.lab1.domain.Logger;
import waa.lab1.lab1.repository.LoggerRepository;

@Service
public class LoggerService {
    @Autowired
    LoggerRepository loggerRepository;
    public void addLog(Logger log){}
}
