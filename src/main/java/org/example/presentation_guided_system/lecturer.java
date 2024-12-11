package org.example.presentation_guided_system;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class lecturer {

    @FXML
    private TableColumn<?, ?> activity_column;

    @FXML
    private JFXButton coursesButton;

    @FXML
    private Button courses_add_btn;

    @FXML
    private Button courses_clear_btn;

    @FXML
    private TableColumn<?, ?> courses_courseCode_column;

    @FXML
    private TextField courses_courseCode_field;

    @FXML
    private TableColumn<?, ?> courses_courseName_column;

    @FXML
    private TextField courses_courseName_field;

    @FXML
    private TableColumn<?, ?> courses_courseStartDate_column;

    @FXML
    private TableView<?> courses_course_table;

    @FXML
    private DatePicker courses_datePicker;

    @FXML
    private Button courses_delete_btn;

    @FXML
    private TableColumn<?, ?> courses_noOfStudents_column;

    @FXML
    private TableColumn<?, ?> courses_presentation_column;

    @FXML
    private TextField courses_presentations_field;

    @FXML
    private TextField courses_searchBar;

    @FXML
    private TableColumn<?, ?> courses_student_ID;

    @FXML
    private TableColumn<?, ?> courses_student_courseCode;

    @FXML
    private TableColumn<?, ?> courses_student_name;

    @FXML
    private TableView<?> courses_student_table;

    @FXML
    private TextField courses_students_field;

    @FXML
    private Button courses_update_btn;

    @FXML
    private Label dashBoard_lecID;

    @FXML
    private Label dashBoard_name;

    @FXML
    private JFXButton dashboardButton;

    @FXML
    private TableView<?> dashboard_table;

    @FXML
    private TableColumn<?, ?> dashboard_table_courseCode;

    @FXML
    private TableColumn<?, ?> dashboard_table_courseName;

    @FXML
    private TableColumn<?, ?> dashboard_table_date;

    @FXML
    private TableColumn<?, ?> dashboard_table_presentation;

    @FXML
    private TableColumn<?, ?> dashboard_table_time;

    @FXML
    private AnchorPane lec_coursesPane;

    @FXML
    private AnchorPane lec_dashBoardPane;

    @FXML
    private Button lec_pre_performance_back_btn;

    @FXML
    private Button lec_pre_performance_btn;

    @FXML
    private AnchorPane lec_pre_performance_pane;

    @FXML
    private Button lec_pre_scheduleMeeting_back_btn;

    @FXML
    private Button lec_pre_schedule_btn;

    @FXML
    private AnchorPane lec_pre_schedule_pane;

    @FXML
    private Button lec_pre_startMeeting_back_btn;

    @FXML
    private Button lec_pre_startMeeting_btn;

    @FXML
    private AnchorPane lec_pre_startMeeting_pane;

    @FXML
    private AnchorPane lec_presentationPane;

    @FXML
    private AnchorPane lec_settingsPane;

    @FXML
    private PasswordField lec_settings_passwordField_1;

    @FXML
    private PasswordField lec_settings_passwordField_2;

    @FXML
    private Button lec_settings_passwordField_update;

    @FXML
    private TextField lec_settings_userNameField_1;

    @FXML
    private TextField lec_settings_userNameField_2;

    @FXML
    private Button lec_settings_userNameField_update;

    @FXML
    private TextField lec_startMeeting_courseCOde_textBox;

    @FXML
    private TextField lec_startMeeting_meetingName_textBox;

    @FXML
    private Button lec_startMeeting_start_btn;

    @FXML
    private TableView<?> performanceAllTable;

    @FXML
    private TableColumn<?, ?> performanceAllTable_courseCode;

    @FXML
    private TableColumn<?, ?> performanceAllTable_courseName;

    @FXML
    private TableColumn<?, ?> performanceAllTable_groupNo;

    @FXML
    private TableColumn<?, ?> performanceAllTable_presentation;

    @FXML
    private TableView<?> performanceCriteria_table;

    @FXML
    private TableColumn<?, ?> performanceCriteria_table_criteria;

    @FXML
    private TableColumn<?, ?> performanceCriteria_table_marks;

    @FXML
    private TableView<?> performanceStudentTable;

    @FXML
    private TableColumn<?, ?> performanceStudentTable_overAllScore;

    @FXML
    private TableColumn<?, ?> performanceStudentTable_studentNo;

    @FXML
    private Button performance_clear_btn;

    @FXML
    private Button performance_groupSearch_btn;

    @FXML
    private TextField performance_searchBar;

    @FXML
    private TableView<?> performance_studentPerformance;

    @FXML
    private TableColumn<?, ?> performance_studentPerformance_criteria;

    @FXML
    private TableColumn<?, ?> performance_studentPerformance_score;

    @FXML
    private Button performance_studentSearch_btn;

    @FXML
    private TextField performance_textField_Criteria;

    @FXML
    private TextField performance_textField_Marks;

    @FXML
    private TextField performance_textField_StudentNo;

    @FXML
    private TextField performance_textField__courseCode;

    @FXML
    private Button performance_textField_add_btn;

    @FXML
    private Button performance_textField_delete_btn;

    @FXML
    private TextField performance_textField_groupNo;

    @FXML
    private JFXButton presentationsButton;

    @FXML
    private TableView<?> recentActivities_table;

    @FXML
    private ChoiceBox<?> scheduleMeeting_ChoiceBox_courseCode;

    @FXML
    private Button scheduleMeeting_btn_clear;

    @FXML
    private Button scheduleMeeting_btn_schedule;

    @FXML
    private Button scheduleMeeting_btn_scheduleAndPrint;

    @FXML
    private DatePicker scheduleMeeting_datePicker;

    @FXML
    private TextField scheduleMeeting_textBox_PresentationName;

    @FXML
    private TextField scheduleMeeting_textBox_Time;

    @FXML
    private TextField scheduleMeeting_textBox_groupNo;

    @FXML
    private JFXButton settingsButton;

    @FXML
    private TableView<?> startMeetingTable;

    @FXML
    private TableColumn<?, ?> startMeetingTable_CourseName;

    @FXML
    private TableColumn<?, ?> startMeetingTable_Date;

    @FXML
    private TableColumn<?, ?> startMeetingTable_GroupNo;

    @FXML
    private TableColumn<?, ?> startMeetingTable_MeetingName;

    @FXML
    private TableColumn<?, ?> startMeetingTable_Password;

    @FXML
    private TableColumn<?, ?> startMeetingTable_TIme;

    @FXML
    private TableColumn<?, ?> startMeetingTable_courseCode;

    @FXML
    private void dashBoardPaneOpen(){
        closeAllPanes();
        lec_dashBoardPane.setVisible(true);
    }
    @FXML
    private void coursesPaneOpen(){
        closeAllPanes();
        lec_coursesPane.setVisible(true);
    }
    @FXML
    private void presentationsPaneOpen(){
        closeAllPanes();
        lec_presentationPane.setVisible(true);
    }
    @FXML
    private void settingsPaneOpen(){
        closeAllPanes();
        lec_settingsPane.setVisible(true);
    }
    @FXML
    private void pre_startMeetingPaneOpen(){
        closeAllPanes();
        lec_pre_startMeeting_pane.setVisible(true);
    }
    @FXML
    private void pre_schedulePaneOpen(){
        closeAllPanes();
        lec_pre_schedule_pane.setVisible(true);
    }
    @FXML
    private void pre_performancePaneOpen(){
        closeAllPanes();
        lec_pre_performance_pane.setVisible(true);
    }

    private void closeAllPanes(){
        lec_dashBoardPane.setVisible(false);
        lec_coursesPane.setVisible(false);
        lec_presentationPane.setVisible(false);
        lec_settingsPane.setVisible(false);
        lec_pre_startMeeting_pane.setVisible(false);
        lec_pre_schedule_pane.setVisible(false);
        lec_pre_performance_pane.setVisible(false);
    }

}
