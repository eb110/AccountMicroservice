package com.figura.cards.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

//needed for the automatic attach of 'CreateBy' and 'UpdatedBy'
//paired with AuditingEntityListener
@Component("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String> {

    //String as 'CreatedBy' and 'UpdatedBy' are of String
    @Override
    public Optional<String> getCurrentAuditor() {
        //for now -> hardcoded value
        return Optional.of("AUTOMATIC_CARDS");
    }
}
