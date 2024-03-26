package daret.projetspringoob.Daret.services;

import daret.projetspringoob.Daret.dto.ParticipationDto;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ParticipationService {

    String telechargerCheque(Long idUtilisateur, MultipartFile cheque);

    ParticipationDto editParticipant(long idParticipant, ParticipationDto participantDto);
    Boolean deleteParticipant(long idParticipant);
    ParticipationDto showParticipantById(long idParticipant);

    ParticipationDto demanderCoparticipation(Long idUtilisateur, Long idParticipation, Long idCoparticipant);

    ParticipationDto accepterDemandeCoParticipation(Long idParticipation);

    ParticipationDto refuserDemandeCoParticipation(Long idParticipation);

    ParticipationDto PayerDemiTontine(Long idParticipant, Long idTontine);

    List<ParticipationDto> ListParticipants();
    ParticipationDto lire(Long id);

    ParticipationDto accepterDemandeParticipation(Long idUtilisateur, Long idParticipation);
    ParticipationDto refuserDemandeParticipation(Long idUtilisateur, Long idParticipation);

    ParticipationDto demanderParticipation(ParticipationDto participationDto);
    ParticipationDto demanderParticipationDouble(ParticipationDto participationDto);
    ParticipationDto demanderParticipationDemi(ParticipationDto participationDto);
    ParticipationDto addParticipant(ParticipationDto participationDto);
    ParticipationDto PayerTontine(Long idParticipant, Long idTontine);
    ParticipationDto refuserDemandeDoubleParticipation( Long idParticipation);
    ParticipationDto accepterDemandeDoubleParticipation(Long idParticipation);
    List<ParticipationDto> ListParticipantsById(Long idParticipant);

}