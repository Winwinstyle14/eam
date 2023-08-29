package vhc.smartw.eam.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(	name = "SYS_USERS")
public class User {
    @Id
    @SequenceGenerator(name = "SYS_USERS_sequence",
            sequenceName = "SYS_USERS_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "SYS_USERS_sequence"
    )
    @Column(name = "ID")
    private Long id;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "FULLNAME")
    private String fullname;
    @Column(name = "SEX")
    private String sex;
    @Column(name = "POSITION")
    private String position;
    @Column(name = "PHONE")
    private String phone;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "LOGIN_BY")
    private String loginBy;
    @Column(name = "RECEIVING_SMS")
    private String receivingSms;
    @Column(name = "RECEIVING_EMAIL")
    private String receivingEmail;
    @Column(name = "IS_ENABLE")
    private String isEnable;
    @Column(name = "ACTIVE_DATE")
    private Date activeDate;
    @Column(name = "EXPIRED")
    private Date expired;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATE_DATE")
    private Date createDate;
    @Column(name = "MODIFIED_BY")
    private String modifiedBy;
    @Column(name = "MODIFY_DATE")
    private Date modifyDate;
    @Column(name = "MA_PHONG")
    private String maPhong;
    @Column(name = "ROLES_ADD_USERS")
    private String rolesAddUsers;
    @Column(name = "CC_EMAIL")
    private String ccEmail;
    @Column(name = "CC_SMS")
    private String ccSms;
    @Column(name = "TEAM")
    private String team;
    @Column(name = "SUB_TEAM")
    private String subTeam;
    @Column(name = "IS_ROLE_SYSTEM")
    private String isRoleSystem;
    @Column(name = "IS_ROLE_MANAGER")
    private String isRoleManger;
    @Column(name = "IS_SMS_LEASELINE")
    private String isSmsLeaseLine;
    @Column(name = "GROUP_CODE")
    private String groupCode;
    @Column(name = "TRUNG_TAM")
    private String trungTam;
    @Column(name = "FO_BO")
    private String foBo;
    @Column(name = "RECEIVE_NOTICE")
    private String receiveNotice;
    @Column(name = "DVT_NAME")
    private String dvtName;
    @Column(name = "NGUOI_DIEU_PHOI")
    private String nguoiDieuPhoi;
    @Column(name = "REGION")
    private String region;
    @Column(name = "TT_NAME")
    private String ttName;
    @Column(name = "TVT_NAME")
    private String tvtName;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role_win", joinColumns = @JoinColumn(name = "User_id"),
            inverseJoinColumns = @JoinColumn(name = "Role_id"))
    private Set<Role> roles = new HashSet<>();


    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
}
