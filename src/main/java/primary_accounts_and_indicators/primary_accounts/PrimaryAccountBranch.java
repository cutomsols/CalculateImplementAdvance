package primary_accounts_and_indicators.primary_accounts;

import branches.objects.Branch;

import javax.persistence.*;

@Entity
@Table(name = "primary_account_branch")
public class PrimaryAccountBranch {
    private long id;
    private PrimaryAccount primaryAccount;
    private Branch branch;
    private float value;
    private String date;

    public PrimaryAccountBranch() {
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @ManyToOne()
    @JoinColumn(name = "primary_account_id")
    public PrimaryAccount getPrimaryAccount() {
        return primaryAccount;
    }

    public void setPrimaryAccount(PrimaryAccount primaryAccount) {
        this.primaryAccount = primaryAccount;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "branch_id")
    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}
